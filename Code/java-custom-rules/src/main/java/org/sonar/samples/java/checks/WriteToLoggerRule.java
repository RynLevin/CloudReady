package org.sonar.samples.java.checks;

import com.google.common.collect.ImmutableList;
import org.sonar.check.Rule;
import org.sonar.check.Priority;
import org.sonar.java.checks.helpers.MethodsHelper;
import org.sonar.java.checks.methods.AbstractMethodDetection;
import org.sonar.java.checks.methods.MethodMatcher;
import org.sonar.plugins.java.api.IssuableSubscriptionVisitor;
import org.sonar.plugins.java.api.tree.ExpressionTree;
import org.sonar.plugins.java.api.tree.MethodInvocationTree;
import org.sonar.plugins.java.api.tree.NewClassTree;
import org.sonar.plugins.java.api.tree.Tree;
import org.sonar.plugins.java.api.tree.Tree.Kind;

import java.util.List;

@Rule(key = "WriteToLogger", 
name = "You should not write to a logger", 
description = "You should not be writing to a logger", 
priority = Priority.CRITICAL, 
tags = {"bug"})
public class WriteToLoggerRule extends IssuableSubscriptionVisitor {

	@Override
	public List<Tree.Kind> nodesToVisit() {
		return ImmutableList.of(Kind.METHOD_INVOCATION);
	}

	@Override
	public void visitNode(Tree tree) {
		MethodInvocationTree mTree = (MethodInvocationTree) tree;
		if(mTree.symbolType().name().equals("Logger")) {
			reportIssue(mTree, "Should not be using a logger");
		}
	}
}

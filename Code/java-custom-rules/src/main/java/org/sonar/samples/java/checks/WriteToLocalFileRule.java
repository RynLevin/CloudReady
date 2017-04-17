package org.sonar.samples.java.checks;

import com.google.common.collect.ImmutableList;

import org.sonar.check.Rule;
import org.sonar.check.Priority;
import org.sonar.plugins.java.api.IssuableSubscriptionVisitor;
import org.sonar.plugins.java.api.semantic.Symbol.MethodSymbol;
import org.sonar.plugins.java.api.semantic.Type;
import org.sonar.plugins.java.api.tree.ExpressionTree;
import org.sonar.plugins.java.api.tree.MethodInvocationTree;
import org.sonar.plugins.java.api.tree.MethodReferenceTree;
import org.sonar.plugins.java.api.tree.MethodTree;
import org.sonar.plugins.java.api.tree.NewClassTree;
import org.sonar.plugins.java.api.tree.Tree;
import org.sonar.plugins.java.api.tree.Tree.Kind;

import java.util.List;

@Rule(key = "WriteToLocalFile", 
	  name = "You should not write to a local file", 
	  description = "You should not be writing to a local file", 
	  priority = Priority.CRITICAL, 
	  tags = {"bug"})
public class WriteToLocalFileRule extends IssuableSubscriptionVisitor {

	@Override
	public List<Tree.Kind> nodesToVisit() {
		return ImmutableList.of(Kind.NEW_CLASS);
	}

	@Override
	public void visitNode(Tree tree) {
		NewClassTree nct = (NewClassTree) tree;
		if(nct.identifier().toString().equals("File")) {
			reportIssue(nct, "Should not be accessing local file");
		}
	}

}
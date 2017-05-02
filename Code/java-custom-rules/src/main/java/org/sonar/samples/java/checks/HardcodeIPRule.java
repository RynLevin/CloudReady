package org.sonar.samples.java.checks;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.sonar.check.Priority;
import org.sonar.check.Rule;
import org.sonar.plugins.java.api.IssuableSubscriptionVisitor;
import org.sonar.plugins.java.api.tree.LiteralTree;
import org.sonar.plugins.java.api.tree.NewClassTree;
import org.sonar.plugins.java.api.tree.Tree;
import org.sonar.plugins.java.api.tree.Tree.Kind;

import com.google.common.collect.ImmutableList;

@Rule(key = "HardcodeIP", 
	  name = "You should not hardcode an IP", 
	  description = "You should not be hardcoding an IP", 
	  priority = Priority.CRITICAL, 
	  tags = {"bug"})
public class HardcodeIPRule extends IssuableSubscriptionVisitor {

	@Override
	public List<Tree.Kind> nodesToVisit() {
		return ImmutableList.of(Kind.STRING_LITERAL);
	}

	@Override
	public void visitNode(Tree tree) {
		LiteralTree lTree = (LiteralTree) tree;

		String ip = lTree.value();
		
		if ( ip == null || ip.isEmpty() ) {
            return;
        }

        String[] parts = ip.split( "\\." );
        if ( parts.length != 4 ) {
            return;
        }

        for ( String s : parts ) {
        	if (isNumeric(s)){
        		int i = Integer.parseInt(s);
	            if ( (i < 0) || (i > 255) ) {
	                return;
	            }
        	}
        }
        if ( ip.endsWith(".") ) {
            return;
        }

		reportIssue(lTree, "Should not using any hardcoded IP Addresses");
	}
	
	public static boolean isNumeric(String str)
	{
	    for (char c : str.toCharArray())
	    {
	        if (!Character.isDigit(c)) return false;
	    }
	    return true;
	}

}

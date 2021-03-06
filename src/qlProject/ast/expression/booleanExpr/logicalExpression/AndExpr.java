package qlProject.ast.expression.booleanExpr.logicalExpression;

import qlProject.ast.expression.BinaryExpression;
import qlProject.ast.expression.IExpression;
import qlProject.ast.expression.IExpressionVisitor;

public class AndExpr extends BinaryExpression {
		
	public AndExpr(IExpression left, IExpression right) {
		super(left, right);
	}


	@Override
	public Object accept(IExpressionVisitor visitor){
		return visitor.visit(this);
	}

}
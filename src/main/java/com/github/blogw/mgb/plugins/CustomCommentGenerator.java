package com.github.blogw.mgb.plugins;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.internal.DefaultCommentGenerator;

public class CustomCommentGenerator extends DefaultCommentGenerator {
	public CustomCommentGenerator() {
		super();
	}

	/**
	 * 给生成的Model类加注释
	 */
	public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		topLevelClass.addJavaDocLine("/**"); //$NON-NLS-1$
		topLevelClass.addJavaDocLine(" * @author blogw"); //$NON-NLS-1$
		topLevelClass.addJavaDocLine(" * @version 1.0"); //$NON-NLS-1$
		topLevelClass.addJavaDocLine(" */"); //$NON-NLS-1$
	}
}

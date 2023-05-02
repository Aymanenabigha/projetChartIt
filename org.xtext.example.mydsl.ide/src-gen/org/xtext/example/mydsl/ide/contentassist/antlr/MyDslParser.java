/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getTypeGrapheAccess().getAlternatives(), "rule__TypeGraphe__Alternatives");
			builder.put(grammarAccess.getCouleursAccess().getAlternatives(), "rule__Couleurs__Alternatives");
			builder.put(grammarAccess.getProgrammeAccess().getGroup(), "rule__Programme__Group__0");
			builder.put(grammarAccess.getProgrammeAccess().getGroup_8(), "rule__Programme__Group_8__0");
			builder.put(grammarAccess.getProgrammeAccess().getGroup_13(), "rule__Programme__Group_13__0");
			builder.put(grammarAccess.getProgrammeAccess().getGroup_18(), "rule__Programme__Group_18__0");
			builder.put(grammarAccess.getGrapheAccess().getGroup(), "rule__Graphe__Group__0");
			builder.put(grammarAccess.getGrapheAccess().getGroup_13(), "rule__Graphe__Group_13__0");
			builder.put(grammarAccess.getColonneAccess().getGroup(), "rule__Colonne__Group__0");
			builder.put(grammarAccess.getDonnerAccess().getGroup(), "rule__Donner__Group__0");
			builder.put(grammarAccess.getProgrammeAccess().getNameAssignment_3(), "rule__Programme__NameAssignment_3");
			builder.put(grammarAccess.getProgrammeAccess().getDonnerAssignment_7(), "rule__Programme__DonnerAssignment_7");
			builder.put(grammarAccess.getProgrammeAccess().getDonnerAssignment_8_1(), "rule__Programme__DonnerAssignment_8_1");
			builder.put(grammarAccess.getProgrammeAccess().getColonneAssignment_12(), "rule__Programme__ColonneAssignment_12");
			builder.put(grammarAccess.getProgrammeAccess().getColonneAssignment_13_1(), "rule__Programme__ColonneAssignment_13_1");
			builder.put(grammarAccess.getProgrammeAccess().getGrapheAssignment_17(), "rule__Programme__GrapheAssignment_17");
			builder.put(grammarAccess.getProgrammeAccess().getGrapheAssignment_18_1(), "rule__Programme__GrapheAssignment_18_1");
			builder.put(grammarAccess.getGrapheAccess().getNameAssignment_0(), "rule__Graphe__NameAssignment_0");
			builder.put(grammarAccess.getGrapheAccess().getDataAssignment_4(), "rule__Graphe__DataAssignment_4");
			builder.put(grammarAccess.getGrapheAccess().getTypeAssignment_8(), "rule__Graphe__TypeAssignment_8");
			builder.put(grammarAccess.getGrapheAccess().getColonneAssignment_12(), "rule__Graphe__ColonneAssignment_12");
			builder.put(grammarAccess.getGrapheAccess().getColonneAssignment_13_1(), "rule__Graphe__ColonneAssignment_13_1");
			builder.put(grammarAccess.getGrapheAccess().getBagColorAssignment_17(), "rule__Graphe__BagColorAssignment_17");
			builder.put(grammarAccess.getColonneAccess().getNameAssignment_1(), "rule__Colonne__NameAssignment_1");
			builder.put(grammarAccess.getColonneAccess().getLabelAssignment_5(), "rule__Colonne__LabelAssignment_5");
			builder.put(grammarAccess.getColonneAccess().getColorAssignment_9(), "rule__Colonne__ColorAssignment_9");
			builder.put(grammarAccess.getDonnerAccess().getNameAssignment_1(), "rule__Donner__NameAssignment_1");
			builder.put(grammarAccess.getDonnerAccess().getLinkAssignment_3(), "rule__Donner__LinkAssignment_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyDslGrammarAccess grammarAccess;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
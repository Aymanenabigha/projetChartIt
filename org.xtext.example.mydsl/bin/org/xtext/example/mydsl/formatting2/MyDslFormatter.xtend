/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.formatting2

import com.google.inject.Inject
import graphe1.Programme
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.example.mydsl.services.MyDslGrammarAccess

class MyDslFormatter extends AbstractFormatter2 {
	
	@Inject extension MyDslGrammarAccess

	def dispatch void format(Programme programme, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (donner : programme.donner) {
			donner.format
		}
		for (colonne : programme.colonne) {
			colonne.format
		}
		for (graphe : programme.graphe) {
			graphe.format
		}
	}
	
}

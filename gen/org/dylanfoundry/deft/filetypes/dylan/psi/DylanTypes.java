// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.dylanfoundry.deft.filetypes.dylan.psi.impl.*;

public interface DylanTypes {

  IElementType HEADER = new DylanElementType("HEADER");
  IElementType HEADERS = new DylanElementType("HEADERS");
  IElementType SOURCE_RECORD = new DylanElementType("SOURCE_RECORD");
  IElementType SOURCE_RECORDS = new DylanElementType("SOURCE_RECORDS");
  IElementType VALUES = new DylanElementType("VALUES");

  IElementType BUILTIN = new DylanTokenType("BUILTIN");
  IElementType CHARACTER = new DylanTokenType("CHARACTER");
  IElementType CLASS = new DylanTokenType("CLASS");
  IElementType COMMENT = new DylanTokenType("COMMENT");
  IElementType CONSTANT = new DylanTokenType("CONSTANT");
  IElementType CRLF = new DylanTokenType("CRLF");
  IElementType FUNCTION = new DylanTokenType("FUNCTION");
  IElementType IDENTIFIER = new DylanTokenType("IDENTIFIER");
  IElementType KEY = new DylanTokenType("KEY");
  IElementType KEYWORD = new DylanTokenType("KEYWORD");
  IElementType NUMBER = new DylanTokenType("NUMBER");
  IElementType OPERATOR = new DylanTokenType("OPERATOR");
  IElementType PUNCTUATION = new DylanTokenType("PUNCTUATION");
  IElementType SEPARATOR = new DylanTokenType("SEPARATOR");
  IElementType SHARP_WORD = new DylanTokenType("SHARP_WORD");
  IElementType STRING = new DylanTokenType("STRING");
  IElementType SYMBOL = new DylanTokenType("SYMBOL");
  IElementType VALUE = new DylanTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == HEADER) {
        return new DylanHeaderImpl(node);
      }
      else if (type == HEADERS) {
        return new DylanHeadersImpl(node);
      }
      else if (type == SOURCE_RECORD) {
        return new DylanSourceRecordImpl(node);
      }
      else if (type == SOURCE_RECORDS) {
        return new DylanSourceRecordsImpl(node);
      }
      else if (type == VALUES) {
        return new DylanValuesImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}

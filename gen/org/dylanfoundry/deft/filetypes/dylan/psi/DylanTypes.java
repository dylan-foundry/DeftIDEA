// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.dylanfoundry.deft.filetypes.dylan.psi.impl.*;

public interface DylanTypes {

  IElementType PROPERTY = new DylanElementType("PROPERTY");
  IElementType VALUE_LIST = new DylanElementType("VALUE_LIST");

  IElementType COMMENT = new DylanTokenType("COMMENT");
  IElementType CRLF = new DylanTokenType("CRLF");
  IElementType KEY = new DylanTokenType("KEY");
  IElementType SEPARATOR = new DylanTokenType("SEPARATOR");
  IElementType VALUE = new DylanTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == PROPERTY) {
        return new DylanPropertyImpl(node);
      }
      else if (type == VALUE_LIST) {
        return new DylanValueListImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}

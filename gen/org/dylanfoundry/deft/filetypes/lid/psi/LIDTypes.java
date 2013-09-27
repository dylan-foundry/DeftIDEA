// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.lid.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.dylanfoundry.deft.filetypes.lid.psi.impl.*;

public interface LIDTypes {

  IElementType PROPERTY = new LIDElementType("PROPERTY");

  IElementType COMMENT = new LIDTokenType("COMMENT");
  IElementType CRLF = new LIDTokenType("CRLF");
  IElementType KEY = new LIDTokenType("KEY");
  IElementType SEPARATOR = new LIDTokenType("SEPARATOR");
  IElementType VALUE = new LIDTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == PROPERTY) {
        return new LIDPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}

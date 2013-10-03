// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.lid.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.dylanfoundry.deft.filetypes.lid.psi.impl.*;

public interface LIDTypes {

  IElementType ITEM = new LIDElementType("ITEM");
  IElementType ITEMS = new LIDElementType("ITEMS");
  IElementType ITEM_KEY = new LIDElementType("ITEM_KEY");
  IElementType ITEM_VALUE = new LIDElementType("ITEM_VALUE");
  IElementType VALUES = new LIDElementType("VALUES");

  IElementType CRLF = new LIDTokenType("CRLF");
  IElementType KEY = new LIDTokenType("KEY");
  IElementType SEPARATOR = new LIDTokenType("SEPARATOR");
  IElementType VALUE = new LIDTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ITEM) {
        return new LIDItemImpl(node);
      }
      else if (type == ITEMS) {
        return new LIDItemsImpl(node);
      }
      else if (type == ITEM_KEY) {
        return new LIDItemKeyImpl(node);
      }
      else if (type == ITEM_VALUE) {
        return new LIDItemValueImpl(node);
      }
      else if (type == VALUES) {
        return new LIDValuesImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}

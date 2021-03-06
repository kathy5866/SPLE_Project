package io.searchbox.indices.type;

/*Generated by MPS */

import io.searchbox.action.GenericResultAbstractAction;
import io.searchbox.action.AbstractMultiTypeActionBuilder;

public class TypeExist extends GenericResultAbstractAction {

  protected TypeExist(TypeExist.Builder builder) {
    super(builder);
    setURI(buildURI());
  }
  @Override
  public String getRestMethodName() {
    return "HEAD";
  }
  public static class Builder extends AbstractMultiTypeActionBuilder<TypeExist, TypeExist.Builder> {
    public Builder(String index) {
      addIndex(index);
    }
    @Override
    public TypeExist build() {
      return new TypeExist(this);
    }
  }
}

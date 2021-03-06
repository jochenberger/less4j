package com.github.sommeri.less4j.core.ast;

import java.util.Collections;
import java.util.List;

import com.github.sommeri.less4j.core.parser.HiddenTokenAwareTree;

public class MediaExpressionFeature extends ASTCssNode {

  private String feature;

  public MediaExpressionFeature(HiddenTokenAwareTree underlyingStructure, String feature) {
    super(underlyingStructure);
    this.feature = feature;
  }

  public boolean isRatioFeature() {
    if (getFeature()==null)
      return false;
    
    
    String feature = getFeature().toLowerCase();
    return feature.endsWith("aspect-ratio") || feature.endsWith("pixel-ratio");
  }

  public String getFeature() {
    return feature;
  }

  public void setFeature(String feature) {
    this.feature = feature;
  }

  @Override
  public List<? extends ASTCssNode> getChilds() {
    return Collections.emptyList();
  }

  @Override
  public ASTCssNodeType getType() {
    return ASTCssNodeType.MEDIUM_EX_FEATURE;
  }

  @Override
  public MediaExpressionFeature clone() {
    return (MediaExpressionFeature) super.clone();
  }
}

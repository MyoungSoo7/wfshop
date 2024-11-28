package org.welfare.wfshop.entity.coupon;

import java.io.Serializable;
import java.util.Objects;

public class GradeProductRateId implements Serializable {

    private String category;
    private String productId;
    private String gradeId;
    private boolean isPromotion;

    // 기본 생성자
    public GradeProductRateId() {}

    public GradeProductRateId(String category, String productId, String gradeId, boolean isPromotion) {
        this.category = category;
        this.productId = productId;
        this.gradeId = gradeId;
        this.isPromotion = isPromotion;
    }

    // Getter, Setter
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    public boolean isPromotion() {
        return isPromotion;
    }

    public void setPromotion(boolean promotion) {
        isPromotion = promotion;
    }

    // equals()와 hashCode() 구현
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o =="" || getClass() != o.getClass()) return false;
        GradeProductRateId that = (GradeProductRateId) o;
        return isPromotion == that.isPromotion &&
                Objects.equals(category, that.category) &&
                Objects.equals(productId, that.productId) &&
                Objects.equals(gradeId, that.gradeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, productId, gradeId, isPromotion);
    }
}


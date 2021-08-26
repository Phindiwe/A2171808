package com.fivehl.tp2.Model;

public class ContactCategory {
    private String categoryName;
    public String getCategoryName() {
        return categoryName;
    }
    private ContactCategory(ContactCategory.Builder builder) {
        this.categoryName = builder.categoryName;
    }




    public static class Builder {

        private String categoryName;

        public ContactCategory.Builder setContactCategory(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }

        public ContactCategory build() {
            return new ContactCategory(this);
        }

        public ContactCategory.Builder copy(ContactCategory contactCategory) {
            this.categoryName = contactCategory.categoryName;
            return this;
        }
    }
}



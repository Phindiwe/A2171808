package com.fivehl.tp2.Factory;
import com.fivehl.tp2.Model.ContactCategory;
public class ContactCategoryFactory {
    public static ContactCategory newContactCategory(String categoryName)
    {

        ContactCategory contactCategory = new ContactCategory.Builder().setContactCategory(categoryName).build();

        return contactCategory;
    }

}

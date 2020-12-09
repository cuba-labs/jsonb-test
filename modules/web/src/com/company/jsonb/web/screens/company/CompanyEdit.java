package com.company.jsonb.web.screens.company;

import com.haulmont.cuba.gui.screen.*;
import com.company.jsonb.entity.Company;

@UiController("jsonb_Company.edit")
@UiDescriptor("company-edit.xml")
@EditedEntityContainer("companyDc")
@LoadDataBeforeShow
public class CompanyEdit extends StandardEditor<Company> {
}
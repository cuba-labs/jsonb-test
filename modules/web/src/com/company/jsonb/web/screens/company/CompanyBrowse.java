package com.company.jsonb.web.screens.company;

import com.haulmont.cuba.gui.screen.*;
import com.company.jsonb.entity.Company;

@UiController("jsonb_Company.browse")
@UiDescriptor("company-browse.xml")
@LookupComponent("companiesTable")
@LoadDataBeforeShow
public class CompanyBrowse extends StandardLookup<Company> {
}
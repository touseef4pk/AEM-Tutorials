package com.mysite.core.models;

import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import org.apache.sling.models.annotations.*;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import java.util.List;

@Model(adaptables = SlingHttpServletRequest.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ContactCardsModel {

    @SlingObject
    private SlingHttpServletRequest slingRequest;

    @Inject
    @Via("resource")
    private List<Contact> contact;

    @PostConstruct
    protected void init() {
        String test = "testing";
    }

    public SlingHttpServletRequest getSlingRequest() {
        return slingRequest;
    }

    public void setSlingRequest(SlingHttpServletRequest slingRequest) {
        this.slingRequest = slingRequest;
    }

    public List<Contact> getContact() {
        return contact;
    }

    public void setContact(List<Contact> contact) {
        this.contact = contact;
    }
}

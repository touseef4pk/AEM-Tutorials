package com.mysite.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.*;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import java.util.List;

@Model(adaptables = SlingHttpServletRequest.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class FeaturedCardsModel {


    @SlingObject
    private SlingHttpServletRequest slingRequest;

    @Inject
    @Via("resource")
    private List<Card> cards;

    @PostConstruct
    protected void init() {

    }

    public SlingHttpServletRequest getSlingRequest() {
        return slingRequest;
    }

    public void setSlingRequest(SlingHttpServletRequest slingRequest) {
        this.slingRequest = slingRequest;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }


}
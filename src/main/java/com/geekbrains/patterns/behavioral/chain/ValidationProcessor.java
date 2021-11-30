package com.geekbrains.patterns.behavioral.chain;

public class ValidationProcessor {

    private final MarketingCampaign campaign;

    public ValidationProcessor(MarketingCampaign campaign) {
        this.campaign = campaign;
    }

    void process(Validator... validators) {
        for (Validator validator : validators) {
            validator.validate(campaign);
        }
    }

}

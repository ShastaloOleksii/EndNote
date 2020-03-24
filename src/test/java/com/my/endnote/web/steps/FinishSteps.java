package com.my.endnote.web.steps;

import com.my.endnote.web.steps.base.BaseStep;
import com.my.endnote.web.utils.ProviderCleaner;
import io.cucumber.java.en.Then;

import java.net.MalformedURLException;

public class FinishSteps extends BaseStep {

  public FinishSteps() throws MalformedURLException {
  }

  @Then("Close driver")
  public void cleanUp() {
    ProviderCleaner.cleanUp();
  }
}

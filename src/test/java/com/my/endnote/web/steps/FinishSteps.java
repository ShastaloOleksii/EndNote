package com.my.endnote.web.steps;

import com.my.endnote.web.steps.base.BaseStep;
import com.my.endnote.web.utils.ProviderCleaner;
import io.cucumber.java.After;

public class FinishSteps extends BaseStep {

  @After
  public void cleanUp() {
    ProviderCleaner.cleanUp();
  }
}

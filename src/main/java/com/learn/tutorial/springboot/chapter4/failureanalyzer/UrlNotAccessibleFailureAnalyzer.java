package com.learn.tutorial.springboot.chapter4.failureanalyzer;

import com.learn.tutorial.springboot.chapter4.exceptions.UrlNotAccessibleException;
import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;

public class UrlNotAccessibleFailureAnalyzer extends AbstractFailureAnalyzer<UrlNotAccessibleException> {
    @Override
    protected FailureAnalysis analyze(Throwable rootFailure, UrlNotAccessibleException cause) {
        return new FailureAnalysis("Unable to access the url " + cause.getUrl(), "Validate the url and ensure it is accessible", cause);
    }
}

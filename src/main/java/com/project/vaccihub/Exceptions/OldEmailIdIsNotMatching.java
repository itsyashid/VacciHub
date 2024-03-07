package com.project.vaccihub.Exceptions;

public class OldEmailIdIsNotMatching extends RuntimeException {
    public OldEmailIdIsNotMatching() {
        super("Old EmailId is not matching");
    }
}
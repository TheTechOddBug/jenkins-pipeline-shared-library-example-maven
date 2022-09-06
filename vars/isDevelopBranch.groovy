#!/usr/bin/env groovy

def call(steps, String branch) {
    return steps.isDevelopBranchWrapper(branch)
}

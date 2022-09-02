#!/usr/bin/env groovy

def call(String branch) {
    return "development".equals(branch)
}

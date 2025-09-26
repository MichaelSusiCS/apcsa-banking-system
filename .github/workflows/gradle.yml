name: Java CI
on: [push, pull_request]
jobs:
  build:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v4
      - uses: actions/setup-java@v4
        with:
          distribution: temurin
          java-version: '17'
      - run: ./gradlew --version
      - run: ./gradlew clean test jacocoTestReport jar
      - uses: actions/upload-artifact@v4
        with:
          name: jar-and-reports
          path: |
            build/libs/*.jar
            build/reports/tests/test/**
            build/reports/jacoco/test/html/**

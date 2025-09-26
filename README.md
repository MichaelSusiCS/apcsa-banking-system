![CI](https://github.com/MichaelSusiCS/apcsa-banking-system/actions/workflows/ci.yml/badge.svg) ![CodeQL](https://github.com/MichaelSusiCS/apcsa-banking-system/actions/workflows/codeql.yml/badge.svg) ![License: MIT](https://img.shields.io/badge/license-MIT-informational)

![Build](https://github.com/MichaelSusiCS/apcsa-banking-system/actions/workflows/gradle.yml/badge.svg)

![Build](https://github.com/MichaelSusiCS/apcsa-banking-system/actions/workflows/build.yml/badge.svg)

# apcsa-banking-system
Simple CLI bank: open accounts, deposit/withdraw/transfer, list balances.

## Run
```bash
find src -name "*.java" | xargs javac -d out
java -cp out bank.BankCli


*Java 17 — CLI project*

**Tech:** Java 17 • Gradle • JUnit 5 • JaCoCo • GitHub Actions
### Run locally
```bash
./gradlew clean test jacocoTestReport jar
java -jar build/libs/*.jar
```


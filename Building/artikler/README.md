# Eksempel på bruk av Gradle

### Kjøre tester

    gradle test

Test-rapport blir lagt i: build/reports/tests/index.html

### Kjøre programmet (uten argumenter)

    gradle run

### Kjøre programmet (også med argumenter)

    gradle install
    build/install/gradle-example/bin/gradle-example

### Rydde opp før levering o.l.

    gradle clean

### gradle wrapper

Hvis man ikke har gradle installert kan man fortsatt kompilere og kjøre. Man bytter da bare ut `gradle` i kommandoene over med `./gradlew`
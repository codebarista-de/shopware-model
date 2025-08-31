# Shopware Model

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Maven Central](https://maven-badges.sml.io/sonatype-central/de.codebarista/shopware-model/badge.svg)](https://maven-badges.sml.io/sonatype-central/de.codebarista/shopware-model)

Auto-generated Java model classes for the Shopware Store API, providing type-safe access to Shopware's data structures.

## Installation

### Maven

```xml

<dependency>
    <groupId>de.codebarista</groupId>
    <artifactId>shopware-model</artifactId>
    <version>0.0.2</version>
</dependency>
```

### Gradle

```gradle
implementation 'de.codebarista:shopware-model:0.0.2'
```

## Package Structure

### Core Package

#### `de.codebarista.shopware.model.core`

Contains auto-generated model classes from Shopware's OpenAPI specification with minimal modifications. These classes
provide direct mapping to Shopware's Store API entities.

### Extension Package

#### `de.codebarista.shopware.model.extension`

Contains additional utility classes and extensions that have proven useful in real-world Shopware integrations. These
are manually crafted classes that complement the generated models.

## Usage

```java
// Core generated models

import de.codebarista.shopware.model.core.*;

Product product=new Product();
        Category category=new Category();

// Extension utilities
import de.codebarista.shopware.model.extension.*;
// ... additional helper classes
```

## Generated from OpenAPI

The core package contains model classes generated from Shopware's official OpenAPI 3 specification (version 6.5.7.3),
ensuring compatibility with the Shopware Store API.

## Dependencies

- Jakarta Annotations API
- Jackson Databind Nullable (optional)

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

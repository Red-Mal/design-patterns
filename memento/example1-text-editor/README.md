# Memento Design Pattern

The Memento pattern is used to save and restore the state of an object without exposing its internal details. It is commonly used in scenarios that require undo/redo functionality, state rollback, or saving checkpoints.

## Examples

1. **Text Editor with Undo/Redo**: Demonstrates how to save and restore text editor content.
2. **User Settings Rollback**: Enables users to revert changes to their settings.
3. **Game Progress Save/Load**: Saves and restores game progress at checkpoints.

Each example is implemented in its own folder with detailed instructions in the respective `README.md` files.

---

## How to Run

### Prerequisites

- Java 17+
- Maven or Gradle
- Spring Boot 3.x

### Running an Example

1. Navigate to the example folder:
    ```bash
    cd memento/example1-text-editor
    ```

2. Run the application:
    ```bash
    ./mvnw spring-boot:run
    ```

---

## License

This project is licensed under the MIT License.

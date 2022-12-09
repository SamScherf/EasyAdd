# EasyAdd

This purpose of this mod is to allow non-developers to easily add things to their game. Right now the mod only supports 1.7.10 and only supports adding non-functional items.

## Requirements

- JDK 8 installed (not just JRE)

## Installation

First clone the repo:

```
git clone https://github.com/SamScherf/EasyAdd.git
cd EasyAdd/
```

Next run the gradlew Decompose script

```
./gradlew setupDecompWorkspace
```

## Usage

Adding items consists of fourth steps: Registering the item, adding the texture, updating the lang file, and compiling.

### Registering the item

Navigate to the initItems() method in the file [src/main/java/com/integral/easyadd/EasyAddItems.java](/src/main/java/com/integral/easyadd/EasyAddItems.java) and call the addItem/addFood methods repeatedly with the name of the item you'd like to add as shown in the examples.

### Adding a texture

Add a 16x16 png with the same name as the item to [src/main/resources/assets/easyadd/textures/items/](/src/main/resources/assets/easyadd/textures/items/) folder

### Updating the language

Navigate to the [src/main/resources/assets/easyadd/lang/en_US.lang](/src/main/resources/assets/easyadd/lang/en_US.lang) file and mimic the mario example under the 'Items' section for every item you'd like to add

### Compiling

To compile, run the gradlew build script like so:

```
./gradlew build
```

The resulting jar file be placed in the folder 'build/libs/'

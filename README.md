# EasyAdd

The purpose of this minecraft mod is to allow non-developers to easily add things to their game. The mod implements child classes of common things in minecraft which are intended to be easier to interact with for non-developers. Since every EasyAdd class is a child of the regular minecraft class, more proficient developers can still add whatever they'd like beyond the simple functionality provided by EasyAdd,

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

Lastly, to compile into a jar that can be put in your mods folder, run the gradlew build script like so:

```
./gradlew build
```

The resulting jar file be placed in the folder 'build/libs/'

## Usage

Adding items consists of three steps: Registering the item, adding the texture, and updating the lang file. After that, simply recompile the mod and enjoy!

### Registering the item

Navigate to the initialize() method of the [EasyAddCustom](src/main/java/com/integral/easyadd/EasyAddCustom.java) class file and initialize EasyAdd classes repeatedly as shown in the examples.

### Adding a texture

Add a 16x16 png with the same name as the item to [src/main/resources/assets/easyadd/textures/items/](/src/main/resources/assets/easyadd/textures/items/) folder

### Updating the language

Navigate to the [src/main/resources/assets/easyadd/lang/en_US.lang](/src/main/resources/assets/easyadd/lang/en_US.lang) file and mimic the given examples under the 'Items' section for every item you'd like to add

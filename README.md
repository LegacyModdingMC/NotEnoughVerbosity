# NotEnoughVerbosity

A tiny FML coremod that forces log4j to use Forge's [default log4j configuration](https://github.com/MinecraftForge/MinecraftForge/blob/9274e4fe435cb415099a8216c1b42235f185443e/fml/src/main/resources/log4j2.xml).

## The problem

Many launchers change log4j's configuration to a less verbose one. (Exhibit A: [HMCL's logger config](https://github.com/huanghongxun/HMCL/blob/c6afd53e73c5a2dc75afc7a1ab279c0b3918da82/HMCLCore/src/main/resources/assets/game/log4j2-1.7.xml).) This limits the usefulness of logs submitted by users.

## The solution

This coremod clears the value of the `log4j.configurationFile` JVM flag, forcing the xml in the Forge jar to be used, as it should!

## Usage

Just drop it into your mods folder. The jar name is deliberately prefixed with `+` characters to make it run as early as possible (the later it runs, the more log messages get lost.)

## License

The project is licensed under the [Unlicense](UNLICENSE).

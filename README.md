## CEM is owned and created by dorianpb. I'm only rewriting for more compatibility.

Original:

- dorianpb Discord https://discord.gg/3qxFZm7Ycw

- dorianpb GitHub https://github.com/dorianpb/cem

# Installation
CCheck out the [Releases](https://github.com/YoungSoulluoS/cemFork/releases) page for builds, or build it yourself.

This mod requires the installation of the [Fabric Loader](https://fabricmc.net/use/ "Fabric Loader"). 

If you want to configure this mod, the installation
of [Mod Menu](https://modrinth.com/mod/modmenu), [CompleteConfig](https://modrinth.com/mod/completeconfig)
and [Cloth Config API](https://modrinth.com/mod/cloth-config)
are also required. 

I also recommend installing the ETF mod. It will help fix some visual errors and expand the CEM mod's capabilities. https://modrinth.com/mod/entitytexturefeatures

And also recommend installing the Animatica mod. This will add animations for textures, e.g. blinking for eyes in FA Addon etc. https://modrinth.com/mod/animatica

## Custom Entity Models (but for Fabric)

An implementation of custom entity models heavily based off of Optifine's format that aims to achieve feature parity with Optifine's custom entity models.

## Current State of this Mod

This mod is currently in ***ALPHA***, meaning that things *MAY* or *MAY NOT* work properly! There is absolutely no guarantee that things will work as intended or at all!

* For now, only the following entities are supported (in alphabetical order):
	* Allay
	* Armor Stands
	* Axolotl
	* Banners
	* Bats
	* Bees
	* Blazes
	* Cats
	* Cod
	* Cows
	* Chicken
	* Creepers
	* Dolphins
	* Endermen
	* Endermite
	* Ender Dragon (must be ender_dragon.jem, not dragon.jem)
	* Fish (just salmon and cod for now)
	* Foxes
	* Frog
	* Ghasts
	* Guardians and Elder Guardians
	* Goat
	* Hoglin and Zoglin
	* Horses and their undead variants, Donkey, Mule
	* Illagers (Evokers, Illusioners, Pillagers, Vindicators, Ravager and Vex)
	* Iron Golems
	* Llama and Trader Llama
	* Magma Cubes
	* Minecarts (all variants)
	* Mooshrooms
	* Ocelots
	* Panda
	* Parrot
	* Phantoms
	* Pigs
	* Piglins (including Piglin Brutes and Zombified Piglins)
	* Polar Bear
	* Rabbits
	* Snow Golem
	* Sheep
	* Shulker
	* Silverfish
	* Skeletons and their variants (Wither Skeletons and Strays)
	* Slimes
	* Spiders (and Cave Spiders)
	* Strider
	* Tadpole
	* Tridents
	* Turtles
	* Villagers (and Zombie Villagers)
	* Wandering Traders
	* Warden
	* Witches
	* Wither
	* Wolves
	* Zombies and their variants (Husks, Drowned, and Giants)

## How to use

This mod loads .jem and .jpm files from  "assets/dorianpb/cem" folder in resource packs. For resource packs intended to be used with Optifine, renaming "
assets/minecraft/optifine/cem" to "assets/dorianpb/cem" should work fine. If you install the optional dependencies, this isn't necessary as there is an option within the
config to just load from optifine's folder structure.

## For resource pack devs

The file format for the .jem and .jpm is identical to the Optfine's (check out [here](https://github.com/sp614x/optifine/blob/master/OptiFineDoc/doc/cem_model.txt ".jem")
, [here](https://github.com/sp614x/optifine/blob/master/OptiFineDoc/doc/cem_part.txt ".jpm"),
and [here](https://github.com/sp614x/optifine/blob/master/OptiFineDoc/doc/cem_animation.txt "animations")). The folder structures inside "assets/dorianpb/cem" does not matter.
If you want to assign a custom model for a creeper, you could put the file as "assets/dorianpb/cem/creeper.jem", "assets/dorianpb/cem/creeper/creeper.jem", "
assets/dorianpb/cem/za/waurdo/creeper.jem", etc.

## Differences

* Individual part textures are not supported (you can only specify texture and texture size in the .jem file).
* Sprites are not supported.
* The `attach` option is not supported.
* This mod will auto create features like the charge aura around a creeper, and the pig's saddle model so that it fits with your custom model, which Optifine doesn't do
	* Mobs like Drowned support customization of their outer layers (drowned_outer.jem would work here).
* Currently, the animations do behave slightly differently than optifine's, just enough to break some packs.

## Licensing

This project is licensed with LGPL v3.0. Please don't repost this project anywhere without my written permission first.

## Goals

* Implement the rest of the entities
* Make animations perfect
* `attach` support
* A better icon! This one succs

## For mod devs

If your fabric mod creates new entities, you can add support for CEM without too much work! Look at net.dorianpb.external for an example implementation. Make sure to use the "
cem" entrypoint.

## Credits

* dorianpb, for actually creating the mod
* sp614x, for Optifine's CEM, which this mod is based on
* Mojang, for actually creating Minecraft
* The Zombie Pigman, whose restoration is the entirety of my motivation for this project
* Anyone else who decides to contribute ([Look here](https://github.com/dorianpb/cem/graphs/contributors))

# aleph-carpet
A carpet extension made for AlephSMP in Minecraft 1.16

This is a fork of FractalCarpetAddon.
## Current Features
### endMainIslandStructureGen
no end spikes, portal, crystal, egg or gateway generation when false
* Type: `boolean`
* Default value: `true`
* Required options: `true`, `false`
* Categories: `aleph-addon`, `feature`, `aleph-end-features`
### endGatewayCooldown
no end gateway cooldown rule
* Type: `boolean`
* Default value: `true`
* Required options: `true`, `false`
* Categories: `aleph-addon`, `feature`, `aleph-end-features`
### keepProjectilesTicked
Keep projectiles ticked in unloaded chunks.
* Type: `boolean`
* Default value: `false`
* Required options: `true`, `false`
* Categories: `aleph-addon`, `feature`
### llamaDupeExploit
Enables old donkey / llmama dupe bug.
* Type: `boolean`
* Default value: `false`
* Required options: `true`, `false`
* Categories: `aleph-addon`, `feature`
### noObsidianPlatform
entities do not generate the obsidian platform in the end, except players
* Type: `boolean`
* Default value: `false`
* Required options: `true`, `false`
* Categories: `aleph-addon`, `feature`, `aleph-end-features`
### forceShulkerTeleport
Force shulkers to teleport when stay in invalid positions
* Type: `boolean`
* Default value: `false`
* Required options: `true`, `false`
* Categories: `aleph-addon`, `survival`, `feature`, `aleph-end-features`
## Features in Development
- Experimental ender pearl ticking for cannons
## 1.16 Roadmap
-   CarefulBreak // I have the feature code for 1.16 we only need to implement it in FractalCarpet
-   StackeableShulkerBoxesInInventories // But not when shulkers get into a hopper from a chest or dispensers or droppers
-   MultiThreading entities by dimension
-   Passive Farms Fix
-   KeepEnderpearls traveling without loading chunks and teleport player when lands

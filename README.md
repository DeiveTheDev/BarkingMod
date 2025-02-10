# Barking Mod

Adds new block for buildings:
- Woods (Log with bark in all sides)
- Stripped Woods
- Stripped Logs  

`Right-Click` in a `log` or `wood` with any `axe` removes their barks

Adds a dog flute

Adds a bark armor

## Prerequisites
- BTA 7.3_01
- Halplibe 5.1.5

## Add you own woods

1. Use the `BlockLogicWood` and `BlockModelCustomRotatable` for woods and `BlockLogicLog` and `BlockModelAxisAligned` for logs.

2. Blocks namespaceIDs needs to be `yourmodname:block/wood_species`, `yourmodname:block/wood_stripped_species`, `yourmodname:block/log_species`, `yourmodname:block/log_stripped_species`. species can have `_` in it!

3. Barks namespaceIDs needs to be `yourmodname:item/bark_species`

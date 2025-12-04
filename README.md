# Hemispheres

**Hemispheres** is a split landscape keyboard for Android, forked from [FlorisBoard](https://github.com/florisboard/florisboard). It features a unique ergonomic design optimized for thumb typing in landscape mode.

## What Makes Hemispheres Different?

Hemispheres splits the QWERTY keyboard into two halves positioned in the **top corners** of your screen when in landscape mode. This design:

- **Maximizes content visibility**: The center ~44% of your screen remains clear for viewing what you're typing
- **Optimizes ergonomics**: Hold your phone like a gaming device (Steam Deck style) with your thumbs naturally reaching the top corners
- **Reduces thumb fatigue**: Natural hand position for extended typing sessions
- **Includes a touchpad**: Right-side touchpad for precise cursor control

## Visual Layout

```
[Phone in Landscape Orientation]
┌─────────────────────────────────────────────┐
│ [Left Keys]    [App Content]    [Right Keys]│
│   1 2 3 4 5                      6 7 8 9 0   │
│   Q W E R T                      Y U I O P   │
│   A S D F G     Visible         H J K L     │
│   Z X C V B      Text           N M , .     │
│   [modifiers]    Area          [touchpad]   │
│                                              │
└─────────────────────────────────────────────┘
```

## Project Status

Hemispheres is currently in **active development**. This is a fork of FlorisBoard with modifications to create the split corner layout.

**Repository**: https://github.com/sawtdakhili/hemispheres
**Base Fork**: [FlorisBoard](https://github.com/florisboard/florisboard)

## Features Inherited from FlorisBoard

- Integrated clipboard manager / history
- Advanced theming support and customization
- Integrated extension support (still evolving)
- Emoji keyboard / history / suggestions
- Free and open-source

## Installation

_Installation instructions will be added once the first release is available._

For now, you can build from source:

```bash
git clone https://github.com/sawtdakhili/hemispheres.git
cd hemispheres
./gradlew assembleDebug
```

The APK will be available in `app/build/outputs/apk/debug/`

## Target Platform

- Android 8.0 (API 26) minimum
- Optimized for phones 5.5" to 7"
- Split layout active in landscape orientation only

## Contributing

Contributions are welcome! This project is in early development, so there's plenty of room for improvements and ideas.

## Acknowledgments

- **FlorisBoard**: This project is a fork of [FlorisBoard](https://github.com/florisboard/florisboard) by patrickgold and contributors
- **Icons**: Brain hemisphere logo generated with AI
- **Concept**: Inspired by ergonomic gaming device layouts (Steam Deck, N-Gage)

## Used Libraries

Hemispheres inherits all libraries from FlorisBoard:

* [AndroidX libraries](https://github.com/androidx/androidx)
* [AboutLibraries](https://github.com/mikepenz/AboutLibraries)
* [Google Material icons](https://github.com/google/material-design-icons)
* [JetPref preference library](https://github.com/patrickgold/jetpref)
* [KotlinX coroutines](https://github.com/Kotlin/kotlinx.coroutines)
* [KotlinX serialization](https://github.com/Kotlin/kotlinx.serialization)

## License

```
Copyright 2020-2025 The FlorisBoard Contributors
Copyright 2025 Hemispheres Contributors

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

## Credits

- Thanks to [Patrick Goldinger](https://github.com/patrickgold) and [The FlorisBoard Contributors](https://github.com/florisboard/florisboard/graphs/contributors) for creating FlorisBoard, which serves as the foundation for this project
- Thanks to all future Hemispheres contributors!

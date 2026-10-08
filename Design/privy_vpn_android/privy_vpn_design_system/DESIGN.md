---
name: Privy VPN Design System
colors:
  surface: '#0e1323'
  surface-dim: '#0e1323'
  surface-bright: '#34394a'
  surface-container-lowest: '#080d1d'
  surface-container-low: '#161b2b'
  surface-container: '#1a1f30'
  surface-container-high: '#25293a'
  surface-container-highest: '#2f3446'
  on-surface: '#dee1f9'
  on-surface-variant: '#bec7d3'
  inverse-surface: '#dee1f9'
  inverse-on-surface: '#2b3041'
  outline: '#89919d'
  outline-variant: '#3f4852'
  surface-tint: '#98cbff'
  primary: '#98cbff'
  on-primary: '#003354'
  primary-container: '#2ba8ff'
  on-primary-container: '#003b60'
  inverse-primary: '#00639c'
  secondary: '#44fad0'
  on-secondary: '#00382c'
  secondary-container: '#00ddb5'
  on-secondary-container: '#005c4a'
  tertiary: '#4edea3'
  on-tertiary: '#003824'
  tertiary-container: '#0cb880'
  on-tertiary-container: '#00412b'
  error: '#ffb4ab'
  on-error: '#690005'
  error-container: '#93000a'
  on-error-container: '#ffdad6'
  primary-fixed: '#cee5ff'
  primary-fixed-dim: '#98cbff'
  on-primary-fixed: '#001d33'
  on-primary-fixed-variant: '#004a77'
  secondary-fixed: '#48fdd3'
  secondary-fixed-dim: '#00e0b8'
  on-secondary-fixed: '#002019'
  on-secondary-fixed-variant: '#005141'
  tertiary-fixed: '#6ffbbe'
  tertiary-fixed-dim: '#4edea3'
  on-tertiary-fixed: '#002113'
  on-tertiary-fixed-variant: '#005236'
  background: '#0e1323'
  on-background: '#dee1f9'
  surface-variant: '#2f3446'
typography:
  display-lg:
    fontFamily: Plus Jakarta Sans
    fontSize: 44px
    fontWeight: '800'
    lineHeight: 52px
    letterSpacing: -0.03em
  display-timer:
    fontFamily: Plus Jakarta Sans
    fontSize: 36px
    fontWeight: '700'
    lineHeight: 44px
    letterSpacing: 0.02em
  headline-lg:
    fontFamily: Plus Jakarta Sans
    fontSize: 28px
    fontWeight: '700'
    lineHeight: 36px
    letterSpacing: -0.02em
  headline-md:
    fontFamily: Plus Jakarta Sans
    fontSize: 22px
    fontWeight: '600'
    lineHeight: 28px
    letterSpacing: -0.01em
  headline-sm:
    fontFamily: Plus Jakarta Sans
    fontSize: 18px
    fontWeight: '600'
    lineHeight: 24px
    letterSpacing: 0em
  title-md:
    fontFamily: Plus Jakarta Sans
    fontSize: 16px
    fontWeight: '600'
    lineHeight: 22px
    letterSpacing: 0em
  body-lg:
    fontFamily: Hanken Grotesk
    fontSize: 16px
    fontWeight: '400'
    lineHeight: 24px
    letterSpacing: 0.01em
  body-md:
    fontFamily: Hanken Grotesk
    fontSize: 14px
    fontWeight: '400'
    lineHeight: 20px
    letterSpacing: 0.01em
  body-sm:
    fontFamily: Hanken Grotesk
    fontSize: 12px
    fontWeight: '400'
    lineHeight: 16px
    letterSpacing: 0.02em
  label-lg:
    fontFamily: Hanken Grotesk
    fontSize: 13px
    fontWeight: '600'
    lineHeight: 18px
    letterSpacing: 0.04em
  label-md:
    fontFamily: Hanken Grotesk
    fontSize: 11px
    fontWeight: '600'
    lineHeight: 16px
    letterSpacing: 0.05em
  telemetry-num:
    fontFamily: Plus Jakarta Sans
    fontSize: 20px
    fontWeight: '700'
    lineHeight: 26px
    letterSpacing: -0.02em
rounded:
  sm: 0.25rem
  DEFAULT: 0.5rem
  md: 0.75rem
  lg: 1rem
  xl: 1.5rem
  full: 9999px
spacing:
  gutter: 1rem
  gutter-mobile: 0.75rem
  margin: 1.25rem
  margin-mobile: 1rem
  space-xxs: 0.25rem
  space-xs: 0.5rem
  space-sm: 0.75rem
  space-md: 1rem
  space-lg: 1.25rem
  space-xl: 1.75rem
  space-xxl: 2.5rem
---

## Brand & Style

This design system establishes an elevated cyber-privacy aesthetic tailored for executive-grade Android VPN utilities. The visual character merges Material 3 architecture with precision fintech telemetry: deep midnight backdrops, atmospheric cyan-teal luminous accents, and tactile glowing connection controls.

The interface evokes uncompromising cryptographic assurance, military-grade telemetry, and effortless calm. Interactions are instantaneous, fluid, and physically anchored. The design rejects intrusive security tropes (such as harsh red locks and aggressive hazard stripes) in favor of deep oceanic depth, whisper-thin structural hairline strokes, and radiant status rings that convey continuous, unbreakable protection.

## Colors

The palette is anchored in an abyssal dark canvas engineered specifically for modern OLED mobile displays.

### Primary, Secondary, and Status Palette
- **Primary Accent (`#2BA8FF`):** Electric Sky Cyan. Used for active navigation, focal action states, high-priority toggles, and connection telemetry highlights.
- **Secondary Accent (`#00E0B8`):** Hyper Teal. Combines in a 135° directional linear gradient with Primary (`#00E0B8` → `#2BA8FF`) for the master shield, active connection glows, and primary action buttons.
- **Protected State (`#10B981`):** Precision Emerald. Signals active cryptographic encapsulation, optimal handshake integrity, and sub-40ms latency metrics.
- **Caution / Moderate Ping (`#F59E0B`):** Warm Amber. Applied to 80–140ms latency tags and temporary handshake renegotiations.
- **High Latency / Alert (`#F43F5E`):** Coral Rose. Reserved for >150ms congestion, kill-switch warnings, or packet drops.
- **Inactive / Idle State (`#64748B`):** Muted Slate Gray. Encodes disconnected standby states, inactive iconography, and disabled power rings.

### Dark Tonal Surfaces
- **Canvas Base / Background:** `#0B1020` (Deep Space Navy).
- **Surface Card Level 1:** `#131A2E` (Deep Indigo Charcoal).
- **Surface Container High Level 2:** `#1C243B` (Elevated Sheet / Modal / Active Sheet).
- **Surface Container Highest Level 3:** `#242E4B` (Tappable chip containers, inner wells, search fields).
- **Hairline Structural Border:** `#232D48` (Ghost outline used at 1dp to separate surfaces without heavy contrast).

## Typography

The type system creates an authoritative hierarchy suited for high-density network metrics and status readouts.

- **Headlines & Metric Counters (Plus Jakarta Sans):** Geometric precision with sculpted terminals gives key indicators—such as protocol badges, uptime clocks, and throughput numbers—a modern, technical presence. The `display-timer` and `telemetry-num` styles utilize tabular figure alignments (`tnum`) to eliminate width flutter during real-time data streaming.
- **Body & Secondary Copy (Hanken Grotesk):** Engineered for legibility on small OLED viewports. Used for server addresses, IP anonymization statements, configuration parameters, and discrete advertisement markers.
- **Hierarchy Rules:** Primary metric labels never exceed `label-md` uppercase styling, ensuring crisp contrast against large primary numerical values.

## Layout & Spacing

Designed around the Android standard portrait target viewport (412 × 915 dp), this system adheres to an 8dp spatial grid with a 4dp micro-step for tight telemetry clusters.

### Spatial Distribution
- **Canvas Margins:** Fixed at `1.25rem` (20dp) on mobile portrait to preserve touch clearance along curved device edges.
- **Component Stacking:** Vertical stacks rely on `space-md` (16dp) between related telemetry cards and `space-xl` (28dp) to isolate the primary connect stage.
- **Connect Stage Clearance:** The central circular action zone maintains a minimum vertical clearance of `space-xxl` (40dp) top and bottom, reserving clean space for pulse rings without crowding surrounding cards.

## Elevation & Depth

This system avoids harsh drop shadows in favor of a layered chromatic depth model suited for dark viewports:

1. **Base Tier (Ground):** `#0B1020` — Flat, absorbing ambient background.
2. **Structural Tier (Cards & Metrics):** `#131A2E` paired with a 1dp outline of `#232D48`. This subtle outline defines boundaries against the canvas without creating visual noise.
3. **Elevated Overlays (Bottom Sheets & Dialogs):** `#1C243B` with a diffuse ambient shadow: `0px 16px 36px rgba(0, 0, 0, 0.50)` and a top edge highlight of `rgba(255, 255, 255, 0.06)`.
4. **Luminous Depth (The Neon Sheen):** Interactive elements emit color-matched diffuse glows rather than black drop shadows:
   - *Connected Aura:* Dual concentric glow `0px 0px 48px rgba(0, 224, 184, 0.28)`, `0px 0px 16px rgba(43, 168, 255, 0.40)`.
   - *Disconnected Aura:* Subtle muted edge `0px 0px 24px rgba(100, 116, 139, 0.12)`.

## Shapes

The geometric architecture pairs generous container corners with razor-sharp pill badges and circular controls:

- **Large Structural Surfaces (Cards, Bottom Sheets):** Fixed at `24dp` (`rounded-2xl`) to `28dp` (`rounded-3xl`), creating a warm, organic feel for cards holding complex security data.
- **Interactive Action Pills:** Server select controls, protocol switches, and discrete ad badges use complete pill geometry (`9999dp`).
- **Master Action Switch:** A pure `1:1` aspect-ratio circle (`rounded-full`), reinforcing physical tactile presence.
- **Embedded Telemetry Wells:** Mini graphs and sparkline track containers use `12dp` to nest cleanly inside the outer `24dp` cards.

## Components

### Master VPN Connect Button
- **Geometry:** 180dp circular unit anchored in the center of the viewport.
- **State — Disconnected:** Surface `#131A2E`, 2dp border `#232D48`. Center power icon rendered in `#64748B`. Static, understated presence.
- **State — Connecting:** Pulsing ambient glow rings radiating outward in `#2BA8FF` at 0.4 opacity. Linear progress loop spinning around the rim.
- **State — Protected:** Filled with a 135° linear gradient (`#00E0B8` to `#2BA8FF`). Center icon in stark white `#FFFFFF`. Backed by an active diffuse cyan-teal outer aura. Sub-label below indicates "PROTECTED" in `10B981`.

### Server Selector Card
- **Structure:** `#131A2E` surface card, 24dp corner radius, 1dp border `#232D48`.
- **Content:** Left side features a circular country flag thumbnail (32dp) with an overlapping micro protocol badge. Center displays the City/Country name in `title-md` and assigned IP in `body-sm`.
- **Ping Metric Pill:** Right-aligned pill container (`#1C243B`) holding a 6dp status dot (Emerald/Amber/Rose) and millisecond count (`label-md`).

### Live Telemetry Cards & Sparklines
- **Structure:** Two-column grid layout spanning 188dp per card.
- **Metrics Displayed:** Download / Upload rate and Session Duration.
- **Sparkline Integration:** 36dp tall real-time vector path at the base of the card. Download utilizes `#00E0B8` with an alpha fill beneath; upload utilizes `#2BA8FF`.
- **Typography:** Value set in `telemetry-num` (`Plus Jakarta Sans` 20dp bold) with unit label (`Mbps`) in `label-sm` slate gray.

### Material 3 Switch Toggles
- **Track:** 52dp width, 32dp height, fully rounded pill. Unchecked state in `#1C243B` with `#232D48` border; checked state in `#2BA8FF`.
- **Thumb:** Unchecked thumb in `#64748B` (16dp). Checked thumb expands to 24dp in stark white `#FFFFFF`, containing a subtle primary checkmark icon.

### Non-Intrusive Sponsored & Native Ad Cards
- **Placement & Container:** Placed below primary connection metrics. Surfaces use `#131A2E` matching first-party cards to avoid disruptive visual breaks.
- **Attribution Badge:** Discrete pill badge in top-left: `#1C243B` background with text reading "SPONSORED" or "AD" in `Hanken Grotesk` 10dp bold (`#64748B`), ensuring transparency without aggressive contrast.
- **Action Button:** Subtle secondary pill button in `#1C243B` with border `#2BA8FF` and label in `#2BA8FF`.
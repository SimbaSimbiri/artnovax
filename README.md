# ArtNovaX 🎨
_Distraction-Free Digital Art Therapy_

ArtNovaX is a distraction-free mobile art therapy app designed to support mental well-being through focused creativity.  
It combines guided art therapy sessions, a responsive drawing canvas, and optional AI-powered emotion awareness — all wrapped in a calm, culturally sensitive experience.

> ⚠️ **Disclaimer:** ArtNovaX is **not** a replacement for professional mental health care. It is a wellness/therapeutic support tool and should be used alongside, not instead of, clinical care where needed.

---

## ✨ Core Idea

Most digital art apps live inside noisy, multi-tasking devices full of notifications, social feeds, and multitasking.  
ArtNovaX flips this: it creates a **sanctuary** for art therapy by:

- Locking the user into **full-screen, distraction-free sessions**
- Providing **guided, therapist-informed exercises**
- Prioritizing **emotional benefit over artistic skill**
- Supporting **offline use** and **culturally resonant content** (starting with African contexts)

---

## 🎯 MVP Goals

For the first version (MVP), ArtNovaX will focus on:

1. **Distraction-Free Sessions**
    - Full-screen immersive UI with minimal chrome
    - Guidance to enable OS-level Focus/DND / Guided Access
    - Session auto-pause if the app is backgrounded or split-screened

2. **Guided & Therapeutic Flows**
    - Time-bound sessions (e.g. 8–15 min) with step-by-step guidance
    - Session types: *breathe*, *draw*, *reflect*, *audio guidance*
    - “Why this helps” explanation for each module (plain language, therapy-first)

3. **Personalization & Emotional Awareness**
    - Optional pre/post mood checks (PHQ-2 + emoji scale)
    - Rule-based recommendations (e.g. “gentler sessions” when low)
    - On-device affect detection (facial emotion) as an **opt-in beta** — no raw video stored

4. **Creative Canvas**
    - Responsive drawing/painting tools (pen, brush, marker, eraser, layers)
    - Low-latency stylus support (pressure/tilt, palm rejection)
    - Undo/redo, autosave, crash recovery, export (PNG / JPEG)

5. **Offline & Progress**
    - Downloadable session packs (e.g. “Ubuntu Flow”, “Grounding Through Color”)
    - Full session flow works offline; syncs when back online
    - Progress: streaks, total time, mood trends (if enabled), gentle reminders

6. **Accessibility, Safety & Culture**
    - WCAG-aligned colors, screen-reader labels, captions/transcripts
    - Visible crisis-support link and risk-aware nudges (if PHQ-2 ≥ threshold)
    - African-inspired starter pack (themes, prompts, music textures)
    - Clear consent, privacy controls, export/delete data options

---

## 🧱 Tech Stack

Planned core stack:

- **Client App**
    - Kotlin + **Compose Multiplatform** (Android first; later iOS/desktop/web)
    - Focus on tablet + stylus, but usable on phone
    - On-device ML via TensorFlow Lite (emotion recognition, optional)

- **Backend**
    - **Ktor** (Kotlin) for API layer
    - Hosted on **AWS** (e.g. Elastic Beanstalk / ECS / Lambda, TBD)
    - Data storage: TBD (e.g. DynamoDB / PostgreSQL), with strong encryption practices

- **ML / AI**
    - Python for model training & experimentation (emotion recognition, recommendation logic)
    - Exported models served on-device (TFLite) or via Ktor (for non-sensitive tasks)

---

## 🚦 Status

**Current phase:** Requirements & design (proposal, concept note, user stories, system requirements).  
**Next phase:** Set up repo structure + implement:

1. Basic Compose UI shell (navigation, theme, full-screen session container)
2. Minimal session engine with a single guided module (e.g. “Grounding Through Color”)
3. First pass of drawing canvas on Android
4. Ktor backend skeleton + simple module fetch

We’re using an **incremental, agile** approach — shipping small vertical slices and refining based on continuous feedback.


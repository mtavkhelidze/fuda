# 札 Fuda

> Type-safe opaque UUID identity system for Scala 3

## Installation

```scala
libraryDependencies += "io.github.mtavkhelidze" %% "fuda" % "0.1.0"
```

## Usage

Define your opaque type:

```scala
import fuda.Fuda

opaque type UserId <: Fuda.Id = Fuda.Id
```

Generate and parse IDs:

```scala
import cats.effect.IO

// Generate
val newId: IO[UserId] = Fuda[UserId].make[IO].run(())

// Parse from string
val parsed: IO[UserId] = Fuda[UserId]
  .read[IO]
  .run("22124234-196c-4d0d-af5c-1a8da7486259")
```

Different opaque types are incompatible at compile time:

```scala
opaque type UserId <: Fuda.Id = Fuda.Id
opaque type ProductId <: Fuda.Id = Fuda.Id

// Does not compile — UserId and ProductId are distinct types
val x: UserId = someProductId
```

## The Kanji

札 (*fuda*) is a Japanese word for a small label, tag, or nameplate — the kind
attached to an object to identify it. A perfect metaphor for a type-safe
identity system.

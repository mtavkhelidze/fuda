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

*札* (*ふだ*) is
a [Japanese word](https://www.japandict.com/%E6%9C%AD#entry-1298970) for label
or tag.

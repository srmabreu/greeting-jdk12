## Shenandoah: A Low-Pause-Time Garbage Collector (Experimental)
RedHat initiated Shenandoah Garbage Collector to reduce GC pause times. The idea is to run GC concurrently with the running Java threads.

## Promptly Return Unused Committed Memory from G1
Stating Java 12, G1 will now check Java Heap memory during inactivity of application and return it to the operating system. This is a preemptive measure to conserve and use free memory.

## Abortable Mixed Collections for G1
Improvements in G1 efficiency include making G1 mixed collections abortable if they might exceed the defined pause target. This is done by splitting the mixed collection set into mandatory and optional.

## Microbenchmark Suite
feature adds a basic suite of microbenchmarks to the JDK source code. This makes it easy for developers to run existing microbenchmarks and create new ones.

## One AArch64 Port, Not Two
removes all of the sources related to the arm64 port while retaining the 32-bit ARM port and the 64-bit aarch64 port. This allows contributors to focus their efforts on a single 64-bit ARM implementation

## Default CDS Archives
This enhances the JDK build process to generate a class data-sharing (CDS) archive, using the default class list, on 64-bit platforms. The goal is to improve startup time. From Java 12, CDS is by default ON.

## JVM Constants API
A new package java.lang.constant is introduced with this JEP. This is not that useful for those developers who don’t use constants pool.

## Raw String Literals is Removed From JDK 12
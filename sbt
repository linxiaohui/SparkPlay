#!/usr/bin/env bash

./sbt-dist/bin/sbt -Dsbt.override.build.repos=true "$@"

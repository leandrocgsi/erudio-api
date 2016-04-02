#!/bin/bash
cd $(dirname $0)

set -e

sudo rm -rf build
mvn clean -X
sudo rm -rf target
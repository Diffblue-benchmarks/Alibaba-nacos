#!/bin/bash

set -euxo pipefail

input="module.txt"
while IFS= read -r line
do
  (
  	cd $line
    ~/gitrepo/cover/cover-ui/cover-cli/target/dcover create --example-config > config.json
  )
done < "$input"
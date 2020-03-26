#!/bin/bash

set -euxo pipefail

input="module.txt"
while IFS= read -r line
do
  (
  	cd $line
    ~/gitrepo/cover/cover-ui/cover-cli/target/dcover create -c config.json | sed 's/^[0-9]*:[0-9]*:[0-9]*\.[0-9]* .\[35m\([A-Z]*\).\[0;39m /\1 /g' | tee cover-cli.out
  )
done < "$input"
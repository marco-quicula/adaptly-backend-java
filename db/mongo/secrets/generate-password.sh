#!/bin/bash

# Generate a random password
password=$(dd if=/dev/urandom bs=1 count=12 2>/dev/null | base64)

sed -i "s/<replace>/$password/g" "$1"

sleep 10

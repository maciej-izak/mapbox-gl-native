#!/bin/bash

set -e
set -o pipefail

find mason_packages -name "mason.ini" -exec cat {} \;

JOB=$1

if [ ! -z "${AWS_ACCESS_KEY_ID}" ] && [ ! -z "${AWS_SECRET_ACCESS_KEY}" ] ; then
    aws s3 cp --recursive --acl public-read --exclude "*" --include "*/actual.png" test/fixtures \
        s3://mapbox/mapbox-gl-native/render-tests/$JOB
fi

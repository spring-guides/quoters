#!/bin/bash -x

set -euo pipefail

ls -ld /.cf

# Login to PWS
/cf api https://api.run.pcfone.io
/cf auth ${PWS_USR} ${PWS_PSW}

# Target spring.io and deploy
/cf target -o group-spring -s spring-guides
/cf push quoters -p target/quoters-incorporated-*.jar
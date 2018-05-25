#!/bin/bash -x

if [ "${CIRCLE_BRANCH}" == "master" ]; then
	./mvnw clean -Dmaven.test.skip=true package

	# Download CF CLI
	wget -O cf-linux.tgz "https://cli.run.pivotal.io/stable?release=linux64-binary&source=github"
	tar xvfz cf-linux.tgz
	chmod 755 ./cf

	# Login to PWS
	./cf api https://api.run.pivotal.io
	./cf auth $CF_USERNAME $CF_PASSWORD

	# Target spring.io and deploy
	./cf target -o spring.io -s Guides
	./cf push gturnquist-quoters -p target/quoters-incorporated-*.jar
else
	echo "We only deploy 'master'."
fi
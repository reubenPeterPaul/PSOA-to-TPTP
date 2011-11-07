#!/bin/bash
BASE_DIR=$(pwd)
HTML_DIR="$BASE_DIR/_build/html"
CS6795PROJ="$HTML_DIR/project-proposal"

cd $HTML_DIR
mv _sources sources
mv _static static
mv _images images
sed -i 's/_static/static/g' *.html 
sed -i 's/_sources/sources/g' *.html
mv main.html index.html


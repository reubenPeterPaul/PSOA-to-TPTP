#!/bin/bash
BASE_DIR=$(pwd)
HTML_DIR="$BASE_DIR/build/html"
CS6795PROP="$HTML_DIR/project-proposal"

echo "cd $HTML_DIR"
cd $HTML_DIR
mv _sources sources && mv _static static
sed -i 's/_static/static/g' *.html 
sed -i 's/_sources/sources/g' *.html
mv main.html index.html

echo "cd $CS6795PROP"
cd $CS6795PROP
sed -i 's/_static/static/g' *.html 
sed -i 's/_sources/sources/g' *.html

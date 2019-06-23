docker run -it --rm \
  -p 8888:8888 -p 4040:4040 \
  --cpus=4.0 --memory=8000M \
  -v "$PWD":/home/jovyan/work \
  "$@" \
  jupyter/all-spark-notebook

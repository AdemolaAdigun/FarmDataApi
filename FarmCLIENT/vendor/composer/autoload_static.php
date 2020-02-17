<?php

// autoload_static.php @generated by Composer

namespace Composer\Autoload;

class ComposerStaticInit20646af536db6036020fb79aebc83ef5
{
    public static $prefixLengthsPsr4 = array (
        'J' => 
        array (
            'JsonSchema\\' => 11,
        ),
    );

    public static $prefixDirsPsr4 = array (
        'JsonSchema\\' => 
        array (
            0 => __DIR__ . '/..' . '/justinrainbow/json-schema/src/JsonSchema',
        ),
    );

    public static function getInitializer(ClassLoader $loader)
    {
        return \Closure::bind(function () use ($loader) {
            $loader->prefixLengthsPsr4 = ComposerStaticInit20646af536db6036020fb79aebc83ef5::$prefixLengthsPsr4;
            $loader->prefixDirsPsr4 = ComposerStaticInit20646af536db6036020fb79aebc83ef5::$prefixDirsPsr4;

        }, null, ClassLoader::class);
    }
}